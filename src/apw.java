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

public class apw extends dnc
    implements eae
{

    private static final boolean f = false;
    private final aqb g;
    private boolean h;

    public apw(eam eam1, aqb aqb1, String s, boolean flag, Object obj)
    {
        super(flag, eam1, s, obj);
        h = false;
        g = aqb1;
    }

    public apw(eam eam1, aqb aqb1, boolean flag, Object obj)
    {
        this(eam1, aqb1, null, flag, obj);
    }

    static aqb a(apw apw1)
    {
        return apw1.g;
    }

    private void a(ebh ebh1, eab eab1, boolean flag, boolean flag1)
    {
        boolean flag2;
        if (flag && ebh1 != null && ebh1.e() != null && eab1 == null && !b.p() || flag && ebh1 == null && eab1 != null && !b.p() || flag && b.p() && ebh1 == null && eab1 == null || !flag && ebh1 == null && eab1 == null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        gbh.a(flag2);
        if (!o())
        {
            break MISSING_BLOCK_LABEL_136;
        }
        ecd.a("ImageRequest.deliverImageOnCorrectThread");
        g.a(ebh1, eab1, flag, this, flag1);
        ecd.a();
        return;
        ebh1;
        ecd.a();
        throw ebh1;
        (new Thread(new apz(this, ebh1, eab1, flag, flag1), "CACHED_BITMAP_TRANSFER_THREAD")).start();
        return;
    }

    static boolean a(apw apw1, eap eap1, int j)
    {
        return apw1.a(eap1, j);
    }

    private boolean a(eap eap1, int j)
    {
        long l;
        gbh.b(eap1);
        gbh.b(eap1.t());
        l = System.currentTimeMillis();
        if (f)
        {
            String s = toString();
            ebw.b("Babel_medialoader", (new StringBuilder(String.valueOf(s).length() + 61)).append("ImageRequest loadImageFromVolley retryCount=").append(j).append(" this=").append(s).toString());
        }
        if (j > 5)
        {
            ebw.f("Babel_medialoader", "Load image from volley retried several times and failed.");
            return false;
        }
        afx afx1 = ccb.a();
        if (!h || afx1.b().a(eap1.t()) != null) goto _L2; else goto _L1
_L2:
        afx1.a(new aij(eap1, new apx(this, l, eap1, j, this), new apy(this, this)));
        j = 0;
          goto _L1
        eap1;
        ebw.e("Babel_medialoader", "Failed to request image", eap1);
        j = 1;
_L1:
        for (j = 1; j != 0;)
        {
            return false;
        }

        return true;
    }

    private static dms b(String s)
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
            ebw.b("Babel_medialoader", ((String) (obj)));
        }
        obj2 = Uri.parse(s);
        contentresolver = g.nS.getContentResolver();
        if (!s.startsWith(ContactsContract.AUTHORITY_URI.toString()))
        {
            break MISSING_BLOCK_LABEL_109;
        }
        obj = (chz)hgx.a(g.nS, chz);
        if (((chz) (obj)).a("android.permission.READ_CONTACTS"))
        {
            break MISSING_BLOCK_LABEL_109;
        }
        flag = ((chz) (obj)).a("android.permission.WRITE_CONTACTS");
        if (!flag)
        {
            return null;
        }
        Object obj1;
        if (!s.startsWith(android.provider.ContactsContract.Contacts.CONTENT_URI.toString()))
        {
            break MISSING_BLOCK_LABEL_187;
        }
        obj1 = contentresolver.openAssetFileDescriptor(((Uri) (obj2)), "r").createInputStream();
        obj2 = "image/jpeg";
_L1:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        obj1 = new dms(ean.a(((java.io.InputStream) (obj1))), ((String) (obj2)), true);
        return ((dms) (obj1));
        obj1;
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "exception reading image ".concat(s);
        } else
        {
            s = new String("exception reading image ");
        }
        ebw.e("Babel_medialoader", s, ((Throwable) (obj1)));
        return null;
        obj1 = contentresolver.openInputStream(((Uri) (obj2)));
        obj2 = ean.b(contentresolver, ((Uri) (obj2)));
          goto _L1
    }

    static boolean i()
    {
        return f;
    }

    public dnb a(byte abyte0[])
    {
        Object obj;
        dzl dzl1;
        boolean flag = false;
        Object obj1 = null;
        boolean flag1;
        if (f)
        {
            obj = String.valueOf(toString());
            int j;
            int l;
            if (((String) (obj)).length() != 0)
            {
                obj = "ImageRequest decodeBytes starting for request ".concat(((String) (obj)));
            } else
            {
                obj = new String("ImageRequest decodeBytes starting for request ");
            }
            ebw.b("Babel_medialoader", ((String) (obj)));
        }
        if (eab.a(abyte0))
        {
            break MISSING_BLOCK_LABEL_362;
        }
        if (abyte0 != null && abyte0.length != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gbh.a(flag1);
        dzl1 = ean.a();
        obj = (eam)b;
        l = ((eam)b).h();
        j = l;
        if (l == 0)
        {
            j = g.a(new ByteArrayInputStream(abyte0), abyte0.length);
        }
        obj = dzl1.a(abyte0, ((eam) (obj)).d(), ((eam) (obj)).e(), j);
        if (f)
        {
            int k;
            if (abyte0 == null)
            {
                k = ((flag) ? 1 : 0);
            } else
            {
                k = abyte0.length;
            }
            if (obj == null)
            {
                abyte0 = null;
            } else
            {
                abyte0 = Integer.valueOf(((Bitmap) (obj)).getWidth());
            }
            abyte0 = String.valueOf(abyte0);
            ebw.b("Babel_medialoader", (new StringBuilder(String.valueOf(abyte0).length() + 55)).append("decodeStaticImageBytes in bytes=").append(k).append(" bitmap out=").append(abyte0).toString());
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        ((dmt)hgx.a(g.nS, dmt)).a(this);
        abyte0 = obj1;
_L4:
        return abyte0;
_L2:
        abyte0 = b(((Bitmap) (obj)));
        if (abyte0 != obj)
        {
            dzl1.a(((Bitmap) (obj)));
        }
        obj = new ebh(abyte0, c());
        ((ebh) (obj)).a();
        dzl1.a(c(), ((ebh) (obj)));
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
        ebw.b("Babel_medialoader", abyte0);
        return ((dnb) (obj));
        boolean flag2 = ((eam)b).j();
        apw apw1;
        if (flag2)
        {
            apw1 = this;
        } else
        {
            apw1 = null;
        }
        abyte0 = new eab(abyte0, apw1, ean.a());
        if (abyte0.f())
        {
            ((dmt)hgx.a(g.nS, dmt)).a(this);
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
            ean.a().a(bitmap);
        }
        bitmap = new ebh(bitmap1, c());
        bitmap.a();
        ean.a().a(c(), bitmap);
        (new Thread(new aqa(this, bitmap), "STATIC_GIF_TRANSFER_THREAD")).start();
    }

    public void a(dnb dnb)
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
                ebw.b("Babel_medialoader", s);
            }
            if (g != null)
            {
                if (!(dnb instanceof eab))
                {
                    break label0;
                }
                a(null, (eab)dnb, true, false);
            }
            return;
        }
        dnb = (ebh)dnb;
        dnb.a();
        a(((ebh) (dnb)), null, true, false);
    }

    public void a(boolean flag)
    {
        if (b instanceof eam)
        {
            ((eam)b).b(flag);
        }
    }

    protected final Bitmap b(Bitmap bitmap)
    {
label0:
        {
            boolean flag2 = false;
            dzl dzl1 = ean.a();
            eam eam1 = (eam)b;
            Bitmap bitmap1;
            Object obj;
            Bitmap bitmap2;
            Canvas canvas;
            Matrix matrix;
            boolean flag;
            boolean flag1;
            if (bitmap.getWidth() != eam1.d() || bitmap.getHeight() != eam1.e())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag2;
            if (eam1.k())
            {
                flag1 = flag2;
                if (flag)
                {
                    flag1 = true;
                }
            }
            if (!flag1 && !eam1.l())
            {
                bitmap1 = bitmap;
                if (!eam1.i())
                {
                    break label0;
                }
            }
            if (eam1.i())
            {
                bitmap1 = ean.a(bitmap);
                bitmap = bitmap1;
            } else
            {
                bitmap1 = null;
            }
            bitmap2 = dzl1.b(eam1.d(), eam1.e());
            canvas = new Canvas(bitmap2);
            matrix = new Matrix();
            if (flag)
            {
                matrix.postScale((float)eam1.d() / (float)bitmap.getWidth(), (float)eam1.e() / (float)bitmap.getHeight());
                obj = new Paint();
                ((Paint) (obj)).setFilterBitmap(true);
            } else
            {
                obj = null;
            }
            canvas.drawBitmap(bitmap, matrix, ((Paint) (obj)));
            if (eam1.l())
            {
                obj = g.nS.getResources();
                float f1;
                if (eam1.m() == amv.b)
                {
                    bitmap = ((BitmapDrawable)((Resources) (obj)).getDrawable(com.google.android.apps.hangouts.R.drawable.aV)).getBitmap();
                } else
                if (eam1.m() == amv.c)
                {
                    bitmap = ((BitmapDrawable)((Resources) (obj)).getDrawable(com.google.android.apps.hangouts.R.drawable.bp)).getBitmap();
                } else
                {
                    bitmap = null;
                }
                n.b(bitmap, "SMS badge should not be empty!");
                f1 = ((Resources) (obj)).getDimension(g.eU);
                canvas.drawBitmap(bitmap, (float)(eam1.d() - bitmap.getWidth()) - f1, (float)(eam1.e() - bitmap.getHeight()) - f1, null);
            }
            if (bitmap1 != null)
            {
                dzl1.a(bitmap1);
            }
            bitmap1 = bitmap2;
        }
        return bitmap1;
    }

    public void b(boolean flag)
    {
        h = flag;
    }

    public dms c_()
    {
        Object obj2;
        boolean flag;
        obj2 = null;
        flag = false;
        Object obj1;
        ecd.a("MediaBytes.getMediaBytes");
        obj1 = b;
        if (((eap) (obj1)).q() == null) goto _L2; else goto _L1
_L1:
        Object obj = String.valueOf(((eap) (obj1)).q());
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
            break MISSING_BLOCK_LABEL_84;
        }
        ((dmt)hgx.a(g.nS, dmt)).a(this);
        obj = obj2;
        ecd.a();
        return ((dms) (obj));
_L4:
        obj = new String("file://");
          goto _L7
        obj;
        ecd.a();
        throw obj;
_L2:
        obj = ((eap) (obj1)).n();
          goto _L7
_L6:
        if (!(obj1 instanceof eam) || !((eam)obj1).g())
        {
            break MISSING_BLOCK_LABEL_192;
        }
        obj = ean.a(Uri.parse(((String) (obj))));
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
        obj = new dms(((ByteArrayOutputStream) (obj1)).toByteArray(), "image/jpeg", false);
          goto _L8
        if (!((String) (obj)).startsWith("content://") && !((String) (obj)).startsWith("android.resource://") && !((String) (obj)).startsWith("file://"))
        {
            break MISSING_BLOCK_LABEL_241;
        }
        obj1 = b(((String) (obj)));
        obj = obj1;
        if (obj1 == null)
        {
            obj = obj1;
            flag = true;
        }
          goto _L8
        if (!dlw.a(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_260;
        }
        dlw.a().a(this);
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

    public boolean d()
    {
        return h;
    }

    public boolean e()
    {
        ebh ebh1 = ean.a().a(c());
        if (ebh1 != null)
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
                ebw.b("Babel_medialoader", s);
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
            ebw.b("Babel_medialoader", s1);
        }
        if (ebh1 != null && g != null)
        {
            a(ebh1, null, true, true);
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
        if (g != null)
        {
            a(null, null, false, false);
        }
    }

    public void h()
    {
        if (g != null)
        {
            a(null, null, true, false);
        }
    }

    public String toString()
    {
        eam eam1 = (eam)b;
        String s = super.toString();
        int j = eam1.d();
        int k = eam1.e();
        boolean flag = a();
        return (new StringBuilder(String.valueOf(s).length() + 68)).append(s).append(" ImageRequest:  (").append(j).append("x").append(k).append(") shouldUseLoaderQueue=").append(flag).toString();
    }

    static 
    {
        hik hik = ebw.d;
    }
}
