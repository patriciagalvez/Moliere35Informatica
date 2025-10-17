import { Component, Input, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-img-header',
  imports: [],
  templateUrl: './img-header.html',
  styleUrl: './img-header.css',
  standalone: true,
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class ImgHeader {
   /* Imagen de fondo (obligatoria) con su ALT para SEO */
  @Input() imgSrc: string = '';
  @Input() imgAlt: string = '';

   /* Título y subtítulo opcionales */
  @Input() title?: string;
  @Input() subtitle?: string;

  /** Altura del bloque, por defecto 55vh */
  @Input() height: string = '55vh';

  /** Opacidad del overlay (0..1). Si no se pasa, no se muestra */
  @Input() overlay?: number;

  /** Alineación del contenido */
  @Input() align: 'left' | 'center' | 'right' = 'center';
src: any;


}
