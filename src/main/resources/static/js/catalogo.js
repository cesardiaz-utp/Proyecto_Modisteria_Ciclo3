const loadProductByFilter = () => {
    // const filtroEscuela = document.querySelector("input[name='escuela']:checked").value;
    // const filtroGenero = document.querySelector("input[name='genero']:checked".value);
    // const filtroTipo =  document.querySelector("input[name='tipo']:checked").value;
    //const  filtroClase = document.querySelector("input[name='diario']:checked
    const filtroEscuela = "Escuela A";
    const filtroGenero = "Femenino";
    const filtroTipo =  "Camisa";
    const filtroClase = "Fisica";
    
    var filtros = {};

    if (filtroEscuela!==undefined) {
        filtros["filtroEscuela"]=filtroEscuela;
    }   
    if (filtroGenero!==undefined) {
        filtros["filtroGenero"]=filtroGenero;
    }
    if (filtroTipo!==undefined) {
        filtros["filtroTipo"]=filtroTipo;
    }
    if(filtroClase!==undefined){
        filtros["filtroClase"]=filtroClase;

    }
    console.log(filtros);
    updateCatalog(filtros);

}

const filtros = async(filtros)=>{
    const url = "/api/catalogo/filter";
    const response = await fetch(url, {
        method: "POST",
        body: JSON.stringify(filtros),
        headers: {
            "Content-Type": "application/json"
        }
    });

    if(filtros.ok){
        
    }


}