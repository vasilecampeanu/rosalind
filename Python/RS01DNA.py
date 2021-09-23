def count_dna_nucleotides(string):
    A = string.count("A")
    C = string.count("C")
    G = string.count("G")
    T = string.count("T")
    return A, C, G, T

def main():
    string = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"
    CNT_A, CNT_C, CNT_G, CNT_T = count_dna_nucleotides(string)
    print(CNT_A, CNT_C, CNT_G, CNT_T)

if __name__ == "__main__":
    main()