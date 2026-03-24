module projeto( 
input [0:1] KEY
output [0:9] LEDR
input[9:0] SW
);

// assing LEDR[0] = KEY[0]& ~SW[0] | KEY[1] & SW[0]
reg z;
always @*  //SENCIVEL A QUALQUER ENTRADA E A UM TIPO DE VARIAVEL ESPICÍFICA TAMBÉM (REG)
beguin    
    case(SW{0})
    
    1'b0 : z <= KEY[0]
    1'b1 : z <= KEY[1]

    endcase
end
assing LEDR[0] = z;

endmodule