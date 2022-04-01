import Text.Printf(printf)

main :: IO ()
main = do
    a <- readLn
    b <- readLn
    printf "MEDIA = %.5f\n" ((a * 3.5 + b * 7.5)/11 :: Double)
