<template>
    <q-layout view="hHh LpR fFf">
        <q-header bordered class="bg-indigo text-white">
            <q-toolbar class="bg-indigo text-white full-width">
                <q-tabs>
                    <q-route-tab
                        name="home"
                        icon="home"
                        to="/home">
                    </q-route-tab>
                    <q-route-tab
                        name="dashboard"
                        label="dashboard"
                        to="/dashboard">
                    </q-route-tab>
                    <q-route-tab
                        name="character"
                        label="Character"
                        to="/character">
                    </q-route-tab>
                    <q-route-tab
                        name="location"
                        label="Location"
                        to="/location">
                    </q-route-tab>
                    <q-route-tab
                        name="stinky"
                        label="Stinky"
                        to="/stinky">
                    </q-route-tab>
                    <!-- <q-space />
                    <q-btn flat round stretch dense icon="logout" class="q-mr-sm"  /> -->
                </q-tabs>
                <q-space />
                <q-btn flat round stretch dense icon="account_circle" class="q-mr-sm" @click="goToUserPage"/>
                <q-btn flat round stretch dense icon="logout" class="q-mr-sm" @click="goToLoginPage" />
            </q-toolbar>
        </q-header>

        <q-page-container style="padding-left: 120px; padding-right: 120px">
            <router-view/>
        </q-page-container>
    </q-layout>
</template>

<script setup lang="ts">
import { useRouter } from 'vue-router';

const router = useRouter()

function goToLoginPage() {
    router.push("/login")
    sessionStorage.setItem('loogedInID', '')
}

function goToUserPage() {
    router.push("/user")
}

</script>
