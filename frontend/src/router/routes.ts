import { RouteRecordRaw } from 'vue-router'

const routes: RouteRecordRaw[] = [
    {
        path: '/',
        redirect: '/dashboard',
        component: () => import('layouts/MainLayout.vue'),
        children: [
            {
                path: 'dashboard',
                name: 'dashboard',
                component: () => import('pages/DashboardPage.vue')
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
