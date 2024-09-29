package com.codsbiz.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRequestAttributeHandler;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Configuration
@EnableMethodSecurity
public class WebSecurityConfiguration {

//    private static final String XSRF_TOKEN = "XSRF-TOKEN";
//    private static final String JSESSION_ID = "JSESSIONID";
//    private static final String SIGN_OUT_PATH = "/logout";
//    private static final String LOGOUT_SUCCESS_URL = "/sign-out.html";

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        CsrfTokenRequestAttributeHandler requestHandler = new CsrfTokenRequestAttributeHandler();
        requestHandler.setCsrfRequestAttributeName("_csrf");

        http
//                .logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher(SIGN_OUT_PATH))
//                .logoutSuccessHandler(new LogoutSuccessHandler() {
//
//                    private final RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
//
//                    @Override
//                    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//                        redirectStrategy.sendRedirect(request, response, LOGOUT_SUCCESS_URL);
//                    }
//                })
//                .invalidateHttpSession(true)
//                .clearAuthentication(true)
//                .deleteCookies(JSESSION_ID, XSRF_TOKEN)
//                .and()
                .csrf()
                .csrfTokenRequestHandler(requestHandler)
                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                .and()
                .addFilterAfter(new CsrfCookieFilter(), BasicAuthenticationFilter.class);
        return http.build();
    }

    private static final class CsrfCookieFilter extends OncePerRequestFilter {

        @Override
        protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
            CsrfToken csrfToken = (CsrfToken) request.getAttribute(CsrfToken.class.getName());
            csrfToken.getToken();
            filterChain.doFilter(request, response);
        }
    }
}
