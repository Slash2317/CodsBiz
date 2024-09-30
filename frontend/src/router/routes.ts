import { RouteRecordRaw } from 'vue-router'

const routes: RouteRecordRaw[] = [
    {
        path: '/',
        redirect: '/home',
        component: () => import('layouts/MainLayout.vue'),
        children: [
            {
                path: 'home',
                name: 'home',
                component: () => import('pages/HomePage.vue')
            },
            {
                path: 'about',
                name: 'about',
                component: () => import('pages/AboutPage.vue')
            },
            {
                path: 'contact',
                name: 'contact',
                component: () => import('pages/ContactPage.vue')
            }
        ]
    },
]

export default routes
