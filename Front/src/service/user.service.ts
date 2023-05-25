import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Router } from "@angular/router";

@Injectable({providedIn: 'root'})
export class UserService {

    private urlEndPoint: string = 'http://localhost:8080/users'
    private header = new HttpHeaders({'Content-typer': 'application/json'})

    constructor(private http: HttpClient, private router: Router){}

    // Futuros metodos //
}