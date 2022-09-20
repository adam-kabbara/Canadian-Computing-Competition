threshold = int(input()) # P value
infected_count = int(input()) # N value / new ppl infected
disease_jump = int(input()) # R value
days = 0
total_infected = infected_count

while (total_infected <= threshold):
    infected_count = infected_count * disease_jump
    total_infected += infected_count
    days += 1

print(days)
