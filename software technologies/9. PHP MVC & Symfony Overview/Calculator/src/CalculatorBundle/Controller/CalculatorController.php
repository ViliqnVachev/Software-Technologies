<?php

namespace CalculatorBundle\Controller;

use Sensio\Bundle\FrameworkExtraBundle\Configuration\Route;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Security;
use CalculatorBundle\Entity\Calculator;
use CalculatorBundle\Form\CalculatorType;
use Symfony\Bundle\FrameworkBundle\Controller\Controller;
use Symfony\Component\HttpFoundation\Request;

class CalculatorController extends Controller
{
    /**
     * @param Request $request
     *
     * @Route("/", name="index")
     *
     * @return \Symfony\Component\HttpFoundation\Response
     *
     */
    public function index(Request $request)
    {
        // TODO add $form and calculation logic;
        $calculator = new Calculator();
        $form = $this->createForm(CalculatorType::class, $calculator);
        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {

            $result = 0;
            $left = $calculator->getLeftOperand();
            $right = $calculator->getRightOperand();
            $operator = $calculator->getOperator();

            switch ($operator) {
                case "+":
                    $result = $left + $right;
                    break;
                case "-":
                    $result = $left - $right;
                    break;
                case "*":
                    $result = $left * $right;
                    break;
                case "/":
                    $result = $left / $right;
                    break;
                case "%":
                    $result = $left % $right;
                    break;
                case "^":
                    $result =pow($left , $right);
                    break;
            }
           return $this->render('calculator/index.html.twig',[
               'result'=>$result, 'calculator'=>$calculator,'form'=>$form->createView()
           ]);
        }

        return $this->render('calculator/index.html.twig');
    }
}
