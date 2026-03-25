module projeto( 
input [0:1] KEY
output [0:9] LEDR
input[9:0] SW
);

// assing LEDR[0] = KEY[0]& ~SW[0] | KEY[1] & SW[0]
reg z [3:0] 
always @*  //SENCIVEL A QUALQUER ENTRADA E A UM TIPO DE VARIAVEL ESPICÍFICA TAMBÉM (REG)
beguin    
    case(SW{1:0})
    
    2'b00 : z[0] <= ~KEY[0]
    2'b01 : z[1] <= ~KEY[0]
    2'b10 : z[2] <= ~KEY[0]
    2'b11 : z[3] <= ~KEY[0]
    default ;
   
    endcase
end
assing LEDR = z;

endmodule