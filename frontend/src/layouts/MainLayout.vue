<template>
    <q-layout view="hHh LpR fFf">
        <q-header class="bg-white">
            <div class="sl-content-container-slim">
                <div class="row justify-center">
                    <q-icon name="home" color="black" size="48px"/>
                </div>
            </div>
            <q-toolbar class="bg-primary text-white full-width row justify-center">
                <q-tabs>
                    <q-route-tab
                        name="home"
                        label="Home"
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
            </q-toolbar>
        </q-header>

        <q-page-container>
            <router-view/>
        </q-page-container>
    </q-layout>
</template>

<script setup lang="ts">

</script>
