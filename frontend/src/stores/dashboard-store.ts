import { defineStore } from 'pinia'
import { httpClient } from 'src/boot/axios'

export const useDashboardStore = defineStore('dashboard', {
    state: () => ({
        name: '' as string,
        specialText: '' as string
    }),
    actions: {
        async loadText() {
            const response = await httpClient.get('/load-text')
            this.specialText = response.data
        },
    },
})
