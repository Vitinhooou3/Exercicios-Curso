import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EnderecoService {

  constructor(private http: HttpClient) { }

  getEndereco(cep: string)  {
    return this.http.get<any>(`https://viacep.com.br/ws/${cep}/json/`)

  }

  cadastrar(nome: string ){
    return this.http.post<any>('url', nome)
  }
}
