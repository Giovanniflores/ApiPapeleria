package camrod.papeleriaboli.model;



import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdProducto;	
    private String ProductoDescripcion;	
    private Double Precio;	
    private String QrUrl;	
    private Integer Estatus;	
    private Integer Stock;	
    private Date FechaIns;	
    private Integer IdUsuarioIns;	
    private Date FechaUp;	
    private Integer IdUsuarioUp;

    public Long getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(Long IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getProductoDescripcion() {
        return ProductoDescripcion;
    }

    public void setProductoDescripcion(String ProductoDescripcion) {
        this.ProductoDescripcion = ProductoDescripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getQrUrl() {
        return QrUrl;
    }

    public void setQrUrl(String QrUrl) {
        this.QrUrl = QrUrl;
    }

    public Integer getEstatus() {
        return Estatus;
    }

    public void setEstatus(Integer Estatus) {
        this.Estatus = Estatus;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer Stock) {
        this.Stock = Stock;
    }

    public Date getFechaIns() {
        return FechaIns;
    }

    public void setFechaIns(Date FechaIns) {
        this.FechaIns = FechaIns;
    }

    public Integer getIdUsuarioIns() {
        return IdUsuarioIns;
    }

    public void setIdUsuarioIns(Integer IdUsuarioIns) {
        this.IdUsuarioIns = IdUsuarioIns;
    }

    public Date getFechaUp() {
        return FechaUp;
    }

    public void setFechaUp(Date FechaUp) {
        this.FechaUp = FechaUp;
    }

    public Integer getIdUsuarioUp() {
        return IdUsuarioUp;
    }

    public void setIdUsuarioUp(Integer IdUsuarioUp) {
        this.IdUsuarioUp = IdUsuarioUp;
    }

}