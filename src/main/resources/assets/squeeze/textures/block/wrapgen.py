# Layers the various wraps over all compressable blocks and saves

from PIL import Image
import os

tiers = ["compressed", "squeezed", "hardened"]

with os.scandir('./bases') as bases:
    for base in bases:
        if base.is_file():
            for tier in tiers:
                base_texture = Image.open(f"bases/{base.name}").convert("RGBA")
                wrap_texture = Image.open(f"wraps/{tier}.png").convert("RGBA")
                Image.alpha_composite(base_texture, wrap_texture).save(f"{tier}_{base.name}")

print('Textures composited')