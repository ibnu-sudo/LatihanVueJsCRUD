<template>
  <div>
    <div class="row justify-content-center my-5">
      <div class="card-body border-color-blue rounded">
        <h5 class="card-title">Success!!!</h5>
        <p class="card-text">Your Data Has Been Inputed</p>
        <router-link to="/" class="btn bg-color-pink text-dark"
          >back</router-link
        >
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "succesUpdate",
};
</script>

<style scoped>
.border-color-blue {
  border: solid 2px rgb(0, 72, 255);
}

.bg-color-pink {
  background-color: aliceblue;
}
.card-body {
  width: 100px;
}
</style>