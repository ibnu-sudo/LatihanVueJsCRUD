<template>
  <div class="">
    <img
      class="card-img-top"
      src="@/assets/img_code.jpg"
      alt="Card image cap"
    />
    <div class=""></div>

    <div class="mt-4 ml-3">
      <router-link class="mx-2" v-show="routeName == 'home'" to="/formPage"
        ><button name="submit" style="" id="" class="btn btn-primary my-3">
          Add Data
        </button></router-link
      >
      <router-link class="mx-2" v-show="routeName == 'formPage'" to="/">
      </router-link>
    </div>
  </div>
</template>

<script>
export default {
  name: "topHeader",
  computed: {
    routeName() {
      return this.$route.name;
    },
  },
};
</script>

<style scoped>
</style>