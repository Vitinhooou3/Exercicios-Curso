import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EnderecoService {

  constructor(private http: HttpClient) { }

  baseUrl: string ='https://viacep.com.br/ws'

  getEndereco(cep: string)  {
    return this.http.get<any>(`${this.baseUrl}/${cep}/json/`)

  }

  cadastrar(nome: string ){
    return this.http.post<any>('url', nome)
  }
}
