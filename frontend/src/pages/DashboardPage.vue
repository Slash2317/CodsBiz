<template>
    <div>
        <h2 style="font-style: italic;">THIS IS DASHBOARD</h2>
        <q-input v-model="name" label="Name" />
        <q-input v-model="clown.name" label="Clown name" />
    </div>
    <q-btn color="primary" label="Character" @click="goToCharacterPage" />
    <q-btn color="primary" label="Character" @click="goToLocationPage" />
    <q-btn style="color: blue;" label="Click here for some special text" @click="loadSpecialText" />
    <h3>{{ specialText }}</h3>
</template>

<script setup lang="ts">
import { useRouter } from 'vue-router';
import { useDashboardStore } from '../stores/dashboard-store';
import { storeToRefs } from 'pinia';

const router = useRouter()

const dashboardStore = useDashboardStore()

const { name, clown, specialText } = storeToRefs(dashboardStore)

function goToCharacterPage() {
    router.push("/character")
}

function goToLocationPage() {
    router.push("/location")
}

function loadSpecialText() {
    dashboardStore.loadText()
}

</script>
