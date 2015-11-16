// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class aqn extends dpw
    implements edi
{

    private static final boolean f = false;
    private static final efh g = efh.a("ImageRequest");
    private final aqs h;
    private boolean i;

    public aqn(edq edq1, aqs aqs1, String s, boolean flag, Object obj)
    {
        super(flag, edq1, s, obj);
        i = false;
        h = aqs1;
    }

    public aqn(edq edq1, aqs aqs1, boolean flag, Object obj)
    {
        this(edq1, aqs1, null, flag, obj);
    }

    static aqs a(aqn aqn1)
    {
        return aqn1.h;
    }

    private void a(eef eef1, edf edf1, boolean flag, boolean flag1)
    {
        String s;
        boolean flag2;
        if (flag && eef1 != null && eef1.e() != null && edf1 == null && !b.p() || flag && eef1 == null && edf1 != null && !b.p() || flag && b.p() && eef1 == null && edf1 == null || !flag && eef1 == null && edf1 == null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        gdv.a("Expected condition to be true", flag2);
        if (!p())
        {
            break MISSING_BLOCK_LABEL_153;
        }
        s = g.b("deliverImageOnCorrectThread");
        h.a(eef1, edf1, flag, this, flag1);
        g.c(s);
        return;
        eef1;
        g.c(s);
        throw eef1;
        (new Thread(new aqq(this, eef1, edf1, flag, flag1), "CACHED_BITMAP_TRANSFER_THREAD")).start();
        return;
    }

    static boolean a(aqn aqn1, edt edt1, int k)
    {
        return aqn1.a(edt1, k);
    }

    private boolean a(edt edt1, int k)
    {
        long l;
        gdv.b("Expected non-null", edt1);
        gdv.b("Expected non-null", edt1.t());
        l = System.currentTimeMillis();
        if (f)
        {
            String s = String.valueOf(toString());
            eev.b("Babel_medialoader", (new StringBuilder(String.valueOf(s).length() + 61)).append("ImageRequest loadImageFromVolley retryCount=").append(k).append(" this=").append(s).toString());
        }
        if (k > 5)
        {
            eev.f("Babel_medialoader", "Load image from volley retried several times and failed.");
            return false;
        }
        afz afz1 = cdg.a();
        if (!i || afz1.b().a(edt1.t()) != null) goto _L2; else goto _L1
_L2:
        afz1.a(new aic(edt1, new aqo(this, l, edt1, k, this), new aqp(this, this)));
        k = 0;
          goto _L1
        edt1;
        eev.e("Babel_medialoader", "Failed to request image", edt1);
        k = 1;
_L1:
        for (k = 1; k != 0;)
        {
            return false;
        }

        return true;
    }

    private static dpm b(String s)
    {
        Object obj2;
        ContentResolver contentresolver;
        if (f)
        {
            Object obj = String.valueOf(s);
            boolean flag;
            if (((String) (obj)).length() != 0)
            {
                obj = "loading local image ".concat(((String) (obj)));
            } else
            {
                obj = new String("loading local image ");
            }
            eev.b("Babel_medialoader", ((String) (obj)));
        }
        obj2 = Uri.parse(s);
        contentresolver = g.nU.getContentResolver();
        if (!s.startsWith(ContactsContract.AUTHORITY_URI.toString()))
        {
            break MISSING_BLOCK_LABEL_109;
        }
        obj = (cjf)hlp.a(g.nU, cjf);
        if (((cjf) (obj)).a("android.permission.READ_CONTACTS"))
        {
            break MISSING_BLOCK_LABEL_109;
        }
        flag = ((cjf) (obj)).a("android.permission.WRITE_CONTACTS");
        if (!flag)
        {
            return null;
        }
        Object obj1;
        if (!s.startsWith(android.provider.ContactsContract.Contacts.CONTENT_URI.toString()))
        {
            break MISSING_BLOCK_LABEL_188;
        }
        obj1 = contentresolver.openAssetFileDescriptor(((Uri) (obj2)), "r").createInputStream();
        obj2 = "image/jpeg";
_L1:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        obj1 = new dpm(edr.a(((java.io.InputStream) (obj1))), ((String) (obj2)), true);
        return ((dpm) (obj1));
        obj1;
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "exception reading image ".concat(s);
        } else
        {
            s = new String("exception reading image ");
        }
        eev.e("Babel_medialoader", s, ((Throwable) (obj1)));
        return null;
        obj1 = contentresolver.openInputStream(((Uri) (obj2)));
        obj2 = edr.b(contentresolver, ((Uri) (obj2)));
          goto _L1
    }

    static boolean i()
    {
        return f;
    }

    static efh j()
    {
        return g;
    }

    public dpv a(byte abyte0[])
    {
        Object obj;
        ecp ecp1;
        boolean flag = false;
        Object obj1 = null;
        boolean flag1;
        if (f)
        {
            obj = String.valueOf(toString());
            int k;
            int i1;
            if (((String) (obj)).length() != 0)
            {
                obj = "ImageRequest decodeBytes starting for request ".concat(((String) (obj)));
            } else
            {
                obj = new String("ImageRequest decodeBytes starting for request ");
            }
            eev.b("Babel_medialoader", ((String) (obj)));
        }
        if (edf.a(abyte0))
        {
            break MISSING_BLOCK_LABEL_364;
        }
        if (abyte0 != null && abyte0.length != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gdv.a("Expected condition to be true", flag1);
        ecp1 = edr.a();
        obj = (edq)b;
        i1 = ((edq)b).h();
        k = i1;
        if (i1 == 0)
        {
            k = g.a(new ByteArrayInputStream(abyte0), abyte0.length);
        }
        obj = ecp1.a(abyte0, ((edq) (obj)).d(), ((edq) (obj)).e(), k);
        if (f)
        {
            int l;
            if (abyte0 == null)
            {
                l = ((flag) ? 1 : 0);
            } else
            {
                l = abyte0.length;
            }
            if (obj == null)
            {
                abyte0 = null;
            } else
            {
                abyte0 = Integer.valueOf(((Bitmap) (obj)).getWidth());
            }
            abyte0 = String.valueOf(abyte0);
            eev.b("Babel_medialoader", (new StringBuilder(String.valueOf(abyte0).length() + 55)).append("decodeStaticImageBytes in bytes=").append(l).append(" bitmap out=").append(abyte0).toString());
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        ((dpn)hlp.a(g.nU, dpn)).a(this);
        abyte0 = obj1;
_L4:
        return abyte0;
_L2:
        abyte0 = b(((Bitmap) (obj)));
        if (abyte0 != obj)
        {
            ecp1.a(((Bitmap) (obj)));
        }
        obj = new eef(abyte0, c());
        ((eef) (obj)).a();
        ecp1.a(c(), ((eef) (obj)));
        abyte0 = ((byte []) (obj));
        if (!f) goto _L4; else goto _L3
_L3:
        abyte0 = String.valueOf(toString());
        if (abyte0.length() != 0)
        {
            abyte0 = "ImageRequest decodeBytes ended for request ".concat(abyte0);
        } else
        {
            abyte0 = new String("ImageRequest decodeBytes ended for request ");
        }
        eev.b("Babel_medialoader", abyte0);
        return ((dpv) (obj));
        boolean flag2 = ((edq)b).j();
        aqn aqn1;
        if (flag2)
        {
            aqn1 = this;
        } else
        {
            aqn1 = null;
        }
        abyte0 = new edf(abyte0, aqn1, edr.a());
        if (abyte0.f())
        {
            ((dpn)hlp.a(g.nU, dpn)).a(this);
            return null;
        }
        if (flag2)
        {
            abyte0.a(false);
            return null;
        } else
        {
            return abyte0;
        }
    }

    public void a(Bitmap bitmap)
    {
        Bitmap bitmap1 = b(bitmap);
        if (bitmap1 != bitmap)
        {
            edr.a().a(bitmap);
        }
        bitmap = new eef(bitmap1, c());
        bitmap.a();
        edr.a().a(c(), bitmap);
        (new Thread(new aqr(this, bitmap), "STATIC_GIF_TRANSFER_THREAD")).start();
    }

    public void a(dpv dpv)
    {
label0:
        {
            if (f)
            {
                String s = String.valueOf(toString());
                if (s.length() != 0)
                {
                    s = "ImageRequest deliverDecoded for request ".concat(s);
                } else
                {
                    s = new String("ImageRequest deliverDecoded for request ");
                }
                eev.b("Babel_medialoader", s);
            }
            if (h != null)
            {
                if (!(dpv instanceof edf))
                {
                    break label0;
                }
                a(null, (edf)dpv, true, false);
            }
            return;
        }
        dpv = (eef)dpv;
        dpv.a();
        a(((eef) (dpv)), null, true, false);
    }

    public void a(boolean flag)
    {
        if (b instanceof edq)
        {
            ((edq)b).b(flag);
        }
    }

    protected final Bitmap b(Bitmap bitmap)
    {
label0:
        {
            boolean flag2 = false;
            ecp ecp1 = edr.a();
            edq edq1 = (edq)b;
            Bitmap bitmap1;
            Object obj;
            Bitmap bitmap2;
            Canvas canvas;
            Matrix matrix;
            boolean flag;
            boolean flag1;
            if (bitmap.getWidth() != edq1.d() || bitmap.getHeight() != edq1.e())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag2;
            if (edq1.k())
            {
                flag1 = flag2;
                if (flag)
                {
                    flag1 = true;
                }
            }
            if (!flag1 && !edq1.l())
            {
                bitmap1 = bitmap;
                if (!edq1.i())
                {
                    break label0;
                }
            }
            if (edq1.i())
            {
                bitmap1 = edr.a(bitmap);
                bitmap = bitmap1;
            } else
            {
                bitmap1 = null;
            }
            bitmap2 = ecp1.b(edq1.d(), edq1.e());
            canvas = new Canvas(bitmap2);
            matrix = new Matrix();
            if (flag)
            {
                matrix.postScale((float)edq1.d() / (float)bitmap.getWidth(), (float)edq1.e() / (float)bitmap.getHeight());
                obj = new Paint();
                ((Paint) (obj)).setFilterBitmap(true);
            } else
            {
                obj = null;
            }
            canvas.drawBitmap(bitmap, matrix, ((Paint) (obj)));
            if (edq1.l())
            {
                obj = g.nU.getResources();
                float f1;
                if (edq1.m() == ann.b)
                {
                    bitmap = ((BitmapDrawable)((Resources) (obj)).getDrawable(com.google.android.apps.hangouts.R.drawable.aR)).getBitmap();
                } else
                if (edq1.m() == ann.c)
                {
                    bitmap = ((BitmapDrawable)((Resources) (obj)).getDrawable(com.google.android.apps.hangouts.R.drawable.bl)).getBitmap();
                } else
                {
                    bitmap = null;
                }
                n.b(bitmap, "SMS badge should not be empty!");
                f1 = ((Resources) (obj)).getDimension(g.eS);
                canvas.drawBitmap(bitmap, (float)(edq1.d() - bitmap.getWidth()) - f1, (float)(edq1.e() - bitmap.getHeight()) - f1, null);
            }
            if (bitmap1 != null)
            {
                ecp1.a(bitmap1);
            }
            bitmap1 = bitmap2;
        }
        return bitmap1;
    }

    public void b(boolean flag)
    {
        i = flag;
    }

    public boolean d()
    {
        return i;
    }

    public dpm d_()
    {
        Object obj2;
        String s;
        boolean flag;
        obj2 = null;
        flag = false;
        s = g.b("MediaBytes.getMediaBytes");
        Object obj1 = b;
        if (((edt) (obj1)).q() == null) goto _L2; else goto _L1
_L1:
        Object obj = String.valueOf(((edt) (obj1)).q());
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        obj = "file://".concat(((String) (obj)));
_L7:
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L6; else goto _L5
_L5:
        flag = true;
        obj = null;
_L8:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        ((dpn)hlp.a(g.nU, dpn)).a(this);
        obj = obj2;
        g.c(s);
        return ((dpm) (obj));
_L4:
        obj = new String("file://");
          goto _L7
        obj;
        g.c(s);
        throw obj;
_L2:
        obj = ((edt) (obj1)).n();
          goto _L7
_L6:
        if (!(obj1 instanceof edq) || !((edq)obj1).g())
        {
            break MISSING_BLOCK_LABEL_207;
        }
        obj = edr.a(Uri.parse(((String) (obj))));
label0:
        {
            if (obj != null)
            {
                break label0;
            }
            flag = true;
            obj = null;
        }
          goto _L8
        obj1 = new ByteArrayOutputStream();
        ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, ((java.io.OutputStream) (obj1)));
        obj = new dpm(((ByteArrayOutputStream) (obj1)).toByteArray(), "image/jpeg", false);
          goto _L8
        if (!((String) (obj)).startsWith("content://") && !((String) (obj)).startsWith("android.resource://") && !((String) (obj)).startsWith("file://"))
        {
            break MISSING_BLOCK_LABEL_256;
        }
        obj1 = b(((String) (obj)));
        obj = obj1;
        if (obj1 == null)
        {
            obj = obj1;
            flag = true;
        }
          goto _L8
        if (!dou.a(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_275;
        }
        dou.a().a(this);
        obj = null;
          goto _L8
        boolean flag1 = a(b, 0);
        if (!flag1)
        {
            flag = true;
            obj = null;
        } else
        {
            flag = false;
            obj = null;
        }
          goto _L8
    }

    public boolean e()
    {
        eef eef1 = edr.a().a(c());
        if (eef1 != null)
        {
            if (f)
            {
                String s = String.valueOf(c());
                if (s.length() != 0)
                {
                    s = "Cache hit for image request: ".concat(s);
                } else
                {
                    s = new String("Cache hit for image request: ");
                }
                eev.b("Babel_medialoader", s);
            }
        } else
        if (f)
        {
            String s1 = String.valueOf(c());
            if (s1.length() != 0)
            {
                s1 = "Cache miss for image request: ".concat(s1);
            } else
            {
                s1 = new String("Cache miss for image request: ");
            }
            eev.b("Babel_medialoader", s1);
        }
        if (eef1 != null && h != null)
        {
            a(eef1, null, true, true);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean f()
    {
        return !b.p();
    }

    public void g()
    {
        if (h != null)
        {
            a(null, null, false, false);
        }
    }

    public void h()
    {
        if (h != null)
        {
            a(null, null, true, false);
        }
    }

    public String toString()
    {
        edq edq1 = (edq)b;
        String s = String.valueOf(super.toString());
        int k = edq1.d();
        int l = edq1.e();
        boolean flag = a();
        return (new StringBuilder(String.valueOf(s).length() + 68)).append(s).append(" ImageRequest:  (").append(k).append("x").append(l).append(") shouldUseLoaderQueue=").append(flag).toString();
    }

    static 
    {
        hnc hnc = eev.d;
    }
}
