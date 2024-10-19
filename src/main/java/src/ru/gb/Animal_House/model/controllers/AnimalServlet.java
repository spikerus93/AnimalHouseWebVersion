package src.ru.gb.Animal_House.model.controllers;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import src.ru.gb.Animal_House.model.Animal;
import src.ru.gb.Animal_House.model.AnimalBuilder;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/animal")
public class AnimalServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int animalClass = Integer.parseInt(request.getParameter("animalClass"));
        String name = request.getParameter("name");
        String birthDateStr = request.getParameter("birthDate");

        try {
            LocalDate birthDate = LocalDate.parse(birthDateStr);

            Animal animal = AnimalBuilder.createAnimal(animalClass, name, birthDate);
            response.getWriter().write(animal.toString());
        } catch (Exception e){
            System.err.println("Error creating Animal: " + e.getMessage());
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }
}
