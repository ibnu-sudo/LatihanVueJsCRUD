<template>
    <div>
        <Header></Header>
        <UpdateFormData></UpdateFormData>
        <copyRight></copyRight>
    </div>
</template>

<script>


import UpdateFormData from '@/components/updateFormData.vue';
import Header from '@/components/header.vue';
import CopyRight from '@/components/copyRight.vue';

export default {
    name: 'formUpdate',
  components: {
    UpdateFormData,
    Header,
    CopyRight,
  },
}
</script>