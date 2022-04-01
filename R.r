input <- file('stdin', 'r')

a <- as.numeric(readLines(input, n=1))
b <- as.numeric(readLines(input, n=1))

write(sprintf("MEDIA = %.5f",(a*3.5 + b*7.5)/11.0),'')
