def dna2rna(string):
    return string.replace('T', 'U')

def main():
    dna_string = "GATGGAACTTGACTACGTAAATT"
    result = dna2rna(dna_string)
    print(result)

if __name__ == "__main__":
    main()