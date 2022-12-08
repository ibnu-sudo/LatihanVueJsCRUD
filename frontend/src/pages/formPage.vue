<template>
    <div>
        <Header></Header>
        <FormList></FormList>
        <copyRight></copyRight>
    </div>
</template>

<script>


import FormList from '@/components/formList.vue';
import Header from '@/components/header.vue';
import CopyRight from '@/components/copyRight.vue';



export default {
    name: 'formPage',
  components: {
    FormList,
    Header,
    CopyRight,
  },
}
</script>