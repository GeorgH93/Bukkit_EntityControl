/*
 * Copyright (C) 2019 GeorgH93
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package at.pcgamingfreaks.EntityControl;

import org.bukkit.Material;

import java.util.HashSet;

public class MagicValues
{
	public static final HashSet<Material> SPAWN_EGGS = new HashSet<>();

	static
	{
		for(Material mat : Material.values())
		{
			if(mat.name().endsWith("SPAWN_EGG"))
				SPAWN_EGGS.add(mat);
		}
	}
}