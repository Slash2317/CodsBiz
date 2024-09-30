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
                        name="about"
                        label="About"
                        to="/about">
                    </q-route-tab>
                    <q-route-tab
                        name="contact"
                        label="Contact"
                        to="/contact">
                    </q-route-tab>
                </q-tabs>
                <q-space />
            </q-toolbar>
        </q-header>

        <q-page-container style="padding-left: 120px; padding-right: 120px">
            <router-view/>
        </q-page-container>
    </q-layout>
</template>

<script setup lang="ts">

</script>
