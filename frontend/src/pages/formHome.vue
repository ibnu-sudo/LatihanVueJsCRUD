<template>
<div>
    <Header></Header>
    <viewData></viewData>
    <copyRight></copyRight>
    
</div>
    
</template>

<script>

import Header from '../components/header.vue';
import viewData from '../components/viewData.vue';
import copyRight from "../components/copyRight.vue";


export default {
  name: 'formPages',
  components: {
    
    Header,
    viewData,
    copyRight,
  },
};

</script>