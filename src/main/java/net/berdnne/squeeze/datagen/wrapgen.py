# Layers the various wraps over all compressable blocks and saves

from PIL import Image
import os

blocks = ["cobblestone", "stone"]
tiers = ["compressed", "squeezed", "hardened"]

for block in blocks:
    base = Image.open(f"{block}_base.png").convert("RGBA")
    for tier in tiers:
        wrap = Image.open(f"{tier}_wrap.png").convert("RGBA")
        Image.alpha_composite(base, wrap).save(f"{tier}_{block}.png")
