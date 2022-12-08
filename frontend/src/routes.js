import formHome from "./pages/formHome.vue";
import formPage from "./pages/formPage.vue";
import formUpdate from "./pages/formUpdate.vue";


export default [
    {
        path: "/",
        name:"home",
        component: formHome,
    },

    {
        path: "/formPage",
        name: "formPage",
        component: formPage,
    },

    {
        path: "/formUpdate/:id",
        name: "formUpdate",
        component: formUpdate,
    }


];