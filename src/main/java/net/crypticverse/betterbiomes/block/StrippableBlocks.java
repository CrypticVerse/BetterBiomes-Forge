/*
 * MIT License
 *
 * Copyright (c) 2023 CrypticVerse
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
package net.crypticverse.betterbiomes.block;

import com.bookkeepersmc.notebook.registry.content.StrippableRegistry;

public class StrippableBlocks {
    public static void registerStripped() {
        StrippableRegistry.registerStripped(BetterBiomeBlocks.THIN_ACACIA_LOG.get(), BetterBiomeBlocks.STRIPPED_THIN_ACACIA_LOG.get());
        StrippableRegistry.registerStripped(BetterBiomeBlocks.THIN_BIRCH_LOG.get(), BetterBiomeBlocks.STRIPPED_THIN_BIRCH_LOG.get());
        StrippableRegistry.registerStripped(BetterBiomeBlocks.THIN_CHERRY_LOG.get(), BetterBiomeBlocks.STRIPPED_THIN_CHERRY_LOG.get());
        StrippableRegistry.registerStripped(BetterBiomeBlocks.THIN_DARK_OAK_LOG.get(), BetterBiomeBlocks.STRIPPED_THIN_DARK_OAK_LOG.get());
        StrippableRegistry.registerStripped(BetterBiomeBlocks.THIN_JUNGLE_LOG.get(), BetterBiomeBlocks.STRIPPED_THIN_JUNGLE_LOG.get());
        StrippableRegistry.registerStripped(BetterBiomeBlocks.THIN_MANGROVE_LOG.get(), BetterBiomeBlocks.STRIPPED_THIN_MANGROVE_LOG.get());
        StrippableRegistry.registerStripped(BetterBiomeBlocks.THIN_OAK_LOG.get(), BetterBiomeBlocks.STRIPPED_THIN_OAK_LOG.get());
        StrippableRegistry.registerStripped(BetterBiomeBlocks.THIN_SPRUCE_LOG.get(), BetterBiomeBlocks.STRIPPED_THIN_SPRUCE_LOG.get());
    }
}
