# Layers the various wraps over all compressable blocks and saves

from PIL import Image

blocks = ["stone", "cobblestone", "netherrack", "iron_block", "sugar_cane_block"]
tiers = ["compressed", "squeezed", "hardened"]

for block in blocks:
    for tier in tiers:
        base = Image.open(f"bases/{block}.png").convert("RGBA")
        wrap = Image.open(f"wraps/{tier}.png").convert("RGBA")
        Image.alpha_composite(base, wrap).save(f"{tier}_{block}.png")
