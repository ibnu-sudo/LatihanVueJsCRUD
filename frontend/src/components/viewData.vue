<template>
  <div class="d-flex flex-wrap">
    <div v-for="item in studentData" :key="item.id" class="card ms-3 mt-3 mr-2" style="width: 25rem">
      <div class="card-body border border-primary">
        <div>
          <h5 class="card-title">
            {{ item.nama + ", " + item.umur + " Years Old" }}
          </h5>
          <div class="col-auto ">
            <p class="card-text">Deskiripsi Diri : {{ item.deskripsi_diri }}</p>
            <p class="card-text">Email           : {{ item.email }}</p>
            <p class="card-text">Soft Skill      : {{ item.soft_skill }}</p>
            <p class="card-text">Hard Skill      : {{ item.hard_skill }}</p>
            <p class="card-text">Interest        : {{ item.interest }}</p>
          </div>

          <div class="d-flex justify-content-between">
              <div>
            <router-link :to="{ path:'/formUpdate/' + item.id}" class="btn btn-primary mr-2">Update</router-link>
    
                <button type="submit" @click="deleteStudent(item.id)" class="btn btn-danger">Delete</button>
               
              </div>
              <div>
            <img class="male" v-if="item.jenis_kelamin == 'Male'" src="../assets/male.png" alt="male" />
            <img class="female" v-else-if="item.jenis_kelamin == 'Female'" src="../assets/female.png" alt="female" />
              </div>
          </div>
        </div>
      </div>
    </div>
    <succesDelete v-show="success"></succesDelete>
  </div>
</template>

<script>
import studentService from "@/services/studentService";
import succesDelete from "@/components/succesDelete.vue";

export default {
  name: "viewBoots",
  components : {
      succesDelete,
  },


  methods: {
    getStudent() {
      studentService
        .getAll()
        .then((response) => {
          this.studentData = response.data;
          console.log(this.studentData);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    deleteStudent(id) {
      if (confirm("apakah anda yakin hapus?")) {
        studentService.delete(id)
          .then((response) => {
            console.log(response.data);
            location.reload();
          })
          .catch((e) => {
            console.log(e);
          });
      } else {
         alert("hapus dibatalkan");
      }
    },
  },
  mounted() {
    this.getStudent();
  },
  data() {
    return {
      studentData: null,
      success : false,
    };
  },
};
</script>

<style scoped>
.male {
  width: 50px;
  margin-left: 100px;
}

.female {
  width: 40px;
  margin-left: 100px;
}
</style>