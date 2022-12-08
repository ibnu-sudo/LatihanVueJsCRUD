<template>
  <div class="row justify-content-center my-5">
    <div class="col-6 p-5 rounded border border-primary" v-show="!succes">
      <form @submit.prevent="inputStudent">
        <h3 class="text-center mb-5">ADD STUDENT</h3>
        <div class="form-row">
          <div class="form-group col-md-6">
            <label for="StudentName">Student Name</label>
            <input
              v-model="studentData.nama"
              type="text"
              class="form-control"
              id="nama"
              placeholder="Student Name"
            />
          </div>
          <div class="form-group col-md-6">
            <label for="ShoftSkill">Shoft Skills</label>
            <input
              v-model="studentData.soft_skill"
              type="text"
              class="form-control"
              id="softSkill"
              placeholder="Shoft Skill"
            />
          </div>
        </div>
        <div class="form-row">
          <div class="form-group col-md-3">
            <label for="StudentAge">Student Age</label>
            <input
              v-model="studentData.umur"
              type="text"
              class="form-control"
              id="umur"
            />
          </div>
          <div class="form-group col-md-3">
            <label for="gender">Genderr</label>
            <select
              v-model="studentData.jenis_kelamin"
              id="jenis_kelamin"
              class="form-control"
            >
              <option selected>Choose...</option>
              <option>Male</option>
              <option>Female</option>
            </select>
          </div>
          <div class="form-group col-md-6">
            <label for="hardSkill">Hard Skill </label>
            <input
              v-model="studentData.hard_skill"
              type="text"
              class="form-control"
              id="hard_skill"
            />
          </div>
        </div>
        <div class="form-row">
          <div class="form-group col-md-6">
            <label for="studentEmail">Student Email</label>
            <input
              v-model="studentData.email"
              type="Email"
              class="form-control"
              id="email"
              placeholder="Studen Email"
            />
          </div>
          <div class="form-group col-md-6">
            <label for="interest">Interest</label>
            <select
              v-model="studentData.interest"
              id="gender"
              class="form-control"
            >
              <option selected>Choose...</option>
              <option>Data Science</option>
              <option>Network</option>
              <option>Web Frontend</option>
              <option>Web Backend</option>
              <option>Mobie Apps</option>
            </select>
          </div>
        </div>
        <div class="form-row">
          <div class="form-group col-md-15">
            <label for="selfDescription">Self Description</label>
            <textarea
              v-model="studentData.deskripsi_diri"
              name="text"
              id="selfDescription"
              cols="75"
              rows="4"
            />
          </div>
        </div>
        <button type="submit" class="btn btn-primary">{{ buttonvalue }}</button>
      </form>
    </div>
    <succesAdd
      v-show="succes"
      style="width: 500px; margin-left: 500px; margin-right: 300px"
    ></succesAdd>
  </div>
</template>

<script>
import studentService from "@/services/studentService";
import succesAdd from "@/components/succesAdd.vue";
export default {
  name: "formPage",

  data() {
    return {
      studentData: {
        deskripsi_diri: null,
        email: null,
        hard_skil: null,
        interest: null,
        jenis_kelamin: null,
        nama: null,
        soft_skill: null,
        umur: null,
      },
      succes: false,
      buttonvalue: "Submit",
    };
  },

  methods: {
    inputStudent() {
      let data = this.studentData;
      if (this.buttonvalue == "Submit") {
        studentService
          .create(data)
          .then((response) => {
            console.log(response.data);
            this.succes = true;
          })
          .catch((e) => {
            console.log(e);
          });
      } else {
        studentService
          .updateStudent(data.id, data)
          .then((response) => {
            console.log(response.data);
            this.succes = true;
          })
          .catch((e) => {
            console.log(e);
          });
      }
    },
  },
  components: {
    succesAdd,
  },
};
</script>

<style>
</style>