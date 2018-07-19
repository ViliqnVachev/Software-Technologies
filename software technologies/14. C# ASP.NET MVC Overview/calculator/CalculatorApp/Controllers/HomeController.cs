using CalculatorApp.Models;
using Microsoft.AspNetCore.Mvc;

namespace CalculatorApp.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index(Calculator calulator)
        {
            return View();
        }

        [HttpPost]
        public IActionResult Calculate(Calculator calcluator)
        {
            calcluator.CalculateResult();

            return RedirectToAction("Index", calcluator);
        }

    }
}
