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
            }
        ]
    },
]

export default routes
