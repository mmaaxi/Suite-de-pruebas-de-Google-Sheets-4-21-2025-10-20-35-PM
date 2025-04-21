Feature: Verificar carga de Google Sheets

  Scenario: Cargar la hoja de cálculo de Google Sheets
    Given El usuario navega a la URL "https://docs.google.com/spreadsheets/d/1EdnVlbe5xR7YwlHRizkcbdBqzVGq5_sVBuEPvZDWsKk/edit?usp=sharing"
    Then La hoja de cálculo se carga correctamente