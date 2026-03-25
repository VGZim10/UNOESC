module circuito(

input [1:0]KEY,
output [9:0]LEDR,
input [9:0]SW
);

//assign LEDR[0] = KEY[0]& ~SW[0] | KEY[1] & SW[0];
reg z, x;


always @* //sensível a qualquer entrada

begin
	case (SW[0])
		1'b1 : z <= KEY[0];
	endcase
	
	case (SW[1])
		1'b1 : x <= KEY[0];
	endcase
end

assign LEDR[0] = z;
assign LEDR[1] = x;
assign LEDR[2] = y;
assign LEDR[3] = k;

endmodule