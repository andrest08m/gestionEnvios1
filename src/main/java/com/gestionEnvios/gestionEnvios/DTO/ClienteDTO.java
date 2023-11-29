package com.gestionEnvios.gestionEnvios.DTO;

public class ClienteDTO {

    private int CLiente_id;
    private int  ClienteCedulaDTO;
    private String  ClienteNombreDTO;
    private String  ClienteApellidoDTO;
    private int  ClienteCelularDTO;
    private String  ClienteCorreoDTO;
    private String  ClienteDireccionDTO;
    private String  ClienteCiudadDTO;

    public ClienteDTO() {
    }


    public ClienteDTO(int CLiente_id, int clienteCedulaDTO, String clienteNombreDTO, String clienteApellidoDTO,
                      int clienteCelularDTO, String clienteCorreoDTO, String clienteDireccionDTO,
                      String clienteCiudadDTO) {
        this.CLiente_id = CLiente_id;
        ClienteCedulaDTO = clienteCedulaDTO;
        ClienteNombreDTO = clienteNombreDTO;
        ClienteApellidoDTO = clienteApellidoDTO;
        ClienteCelularDTO = clienteCelularDTO;
        ClienteCorreoDTO = clienteCorreoDTO;
        ClienteDireccionDTO = clienteDireccionDTO;
        ClienteCiudadDTO = clienteCiudadDTO;
    }

    public int getClienteCedulaDTO() {
            return ClienteCedulaDTO;
        }

        public void setClienteCedulaDTO(int clienteCedulaDTO) {
            ClienteCedulaDTO = clienteCedulaDTO;
        }

        public String getClienteNombreDTO() {
            return ClienteNombreDTO;
        }

        public void setClienteNombreDTO(String clienteNombreDTO) {
            ClienteNombreDTO = clienteNombreDTO;
        }

        public String getClienteApellidoDTO() {
            return ClienteApellidoDTO;
        }

        public void setClienteApellidoDTO(String clienteApellidoDTO) {
            ClienteApellidoDTO = clienteApellidoDTO;
        }

        public int getClienteCelularDTO() {
            return ClienteCelularDTO;
        }

        public void setClienteCelularDTO(int clienteCelularDTO) {
            ClienteCelularDTO = clienteCelularDTO;
        }

        public String getClienteCorreoDTO() {
            return ClienteCorreoDTO;
        }

        public void setClienteCorreoDTO(String clienteCorreoDTO) {
            ClienteCorreoDTO = clienteCorreoDTO;
        }

        public String getClienteDireccionDTO() {
            return ClienteDireccionDTO;
        }

        public void setClienteDireccionDTO(String clienteDireccionDTO) {
            ClienteDireccionDTO = clienteDireccionDTO;
        }

        public String getClienteCiudadDTO() {
            return ClienteCiudadDTO;
        }

        public void setClienteCiudadDTO(String clienteCiudadDTO) {
            ClienteCiudadDTO = clienteCiudadDTO;
        }

    public int getCLiente_id() {
        return CLiente_id;
    }

    public void setCLiente_id(int CLiente_id) {
        this.CLiente_id = CLiente_id;
    }
}
