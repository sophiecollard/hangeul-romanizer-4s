package com.github.sophiecollard.transcriber.text

trait Text[+A] {

  def chars: List[A]

}
