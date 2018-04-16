﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Taller01.Models
{
    public class Category
    {
        public Guid Id { get; set; }
        public string Name { get; set; }
        public DateTime DateCreated { get; set; }
        public Category()
        {
            DateCreated = DateTime.Now;
        }
        
    }
}
