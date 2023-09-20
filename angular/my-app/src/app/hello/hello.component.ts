import { Component, Input } from '@angular/core';
import { Router } from '@angular/router';
import { EnderecoService } from '../Service/endereco.service';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent {

  constructor(private route: Router, private endereco: EnderecoService){

  }

  @Input() name: string = 'Truma'

  isVisible: boolean = true

  count: number = 0

  nome: string = 'Victor'


  clicked(): void{
    window.alert('Olá')
  }

  submit(): void{
    console.log(this.nome)
  }
  
  somar(): void{
    this.count += 1
  }

  subtrair(): void{
    this.count -= 1
  }

  list: any[] = [
    {name: 'Jorge'},
    {name: 'Jõao'},
    {name: 'rafael'}
  ]

  mudarRota(): void{
    this.route.navigate(['/rota'])
  }
  mudarRota2(): void{
    this.route.navigate(['/hello'])
  }

  buscar(){
    this.endereco.getEndereco('14051330').subscribe({
      next: (response) => {
        console.log(response)
      },
      error(err){
        console.log(err)
      }
    })
  }
}
