module projeto( 
input [0:1] KEY
output [0:9] LEDR
input[9:0] SW
);

// assing LEDR[0] = KEY[0]& ~SW[0] | KEY[1] & SW[0]

always @*
    case(SW{0})
    
    1'b0 :
    1'b1 :
    
    endcase
endmodule