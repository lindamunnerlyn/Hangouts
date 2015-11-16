// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.gms.maps.model.LatLng;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.MultipartContent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class cvr extends cvt
{

    private static final boolean a = false;
    private final Context b;
    private final int r;
    private final String s;
    private final int t;
    private List u;
    private MultipartContent v;

    public cvr(Context context, aoa aoa1, dmi dmi, int i, djh djh1, String s1)
    {
        super(hio.newBuilder().a(aoa1.a()).b(aoa1.ab()).a(new hih()).a(true).a(), djh1, "conversations/sendchatmessage", dmi, new jds(), new jdt());
        r = aoa1.h();
        b = context;
        s = s1;
        t = i;
        u = new ArrayList();
    }

    private static AbstractInputStreamContent a(Context context, atx atx1)
    {
        ContentResolver contentresolver;
        g.d(atx1.a, "Error: Input media with null URI");
        contentresolver = context.getContentResolver();
        if (!"image/gif".equals(atx1.d) && g.b(atx1.d)) goto _L2; else goto _L1
_L1:
        Uri uri;
        uri = Uri.parse(atx1.a);
        context = contentresolver.openInputStream(uri);
        long l = (new File(uri.getPath())).length();
_L3:
        FileNotFoundException filenotfoundexception;
        if (context == null)
        {
            context = String.valueOf(atx1.a);
            ecp ecp1;
            Object obj;
            int i;
            if (context.length() != 0)
            {
                context = "We could not create an inputStream for the uri: ".concat(context);
            } else
            {
                context = new String("We could not create an inputStream for the uri: ");
            }
            eev.f("Babel_SendMediaMessage", context);
            return null;
        } else
        {
            context = new InputStreamContent(atx1.d, context);
            context.setLength(l);
            return context;
        }
        filenotfoundexception;
        context = null;
_L12:
        eev.e("Babel_SendMediaMessage", "FileNotFoundException trying to detect how large the attachment is", filenotfoundexception);
        l = 0L;
          goto _L3
_L2:
        i = g.a(context, "babel_thumbnail_photo_upload_size", 320);
        ecp1 = edr.a();
        obj = edr.a(context.getContentResolver().openInputStream(Uri.parse(atx1.a)));
        if (obj == null) goto _L5; else goto _L4
_L4:
        if (obj.length != 0) goto _L6; else goto _L5
_L5:
        context = String.valueOf(atx1.a);
        if (context.length() == 0) goto _L8; else goto _L7
_L7:
        context = "Could not parse uri for input stream: ".concat(context);
_L9:
        eev.g("Babel_SendMediaMessage", context);
        return null;
_L8:
        context = new String("Could not parse uri for input stream: ");
          goto _L9
        ecp1;
        context = null;
_L11:
        obj = String.valueOf(atx1.a);
        if (((String) (obj)).length() != 0)
        {
            obj = "Could not open file corresponding to uri ".concat(((String) (obj)));
        } else
        {
            obj = new String("Could not open file corresponding to uri ");
        }
        eev.e("Babel_SendMediaMessage", ((String) (obj)), ecp1);
        l = 0L;
          goto _L3
_L6:
        if (!atx1.a.startsWith(EsProvider.c(context)))
        {
            break MISSING_BLOCK_LABEL_283;
        }
        eev.e("Babel_SendMediaMessage", "Sending cache file.");
        context = new ByteArrayInputStream(((byte []) (obj)));
        i = obj.length;
        l = i;
          goto _L3
        context = ecp1.a(((byte []) (obj)), i, i, atx1.g);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        eev.g("Babel_SendMediaMessage", "Null bitmap");
        return null;
        obj = edr.a(context, 70);
        ecp1.a(context);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_331;
        }
        if (obj.length != 0)
        {
            break MISSING_BLOCK_LABEL_374;
        }
        context = String.valueOf(atx1.a);
        if (context.length() == 0)
        {
            break MISSING_BLOCK_LABEL_361;
        }
        context = "Could not parse uri for bitmap: ".concat(context);
_L10:
        eev.g("Babel_SendMediaMessage", context);
        return null;
        context = new String("Could not parse uri for bitmap: ");
          goto _L10
        context = new ByteArrayInputStream(((byte []) (obj)));
        i = obj.length;
        l = i;
          goto _L3
        ecp1;
          goto _L11
        ecp1;
          goto _L11
        ecp1;
          goto _L12
    }

    private void a(djh djh1, int i)
    {
        djh1 = (new cab()).a(djh1.b()).b(djh1.a()).d(super.o.c());
        h.a(r, SystemClock.elapsedRealtime(), i, djh1);
    }

    private void a(jds jds1)
    {
        djh djh1 = (djh)super.e;
        Object obj = new izg();
        obj.b = aow.c(djh1.a());
        if (!g.a(b, "babel_contingency_mode_enabled", false) && !djh1.i())
        {
            obj.a = cvu.a(djh1.b());
        }
        Object obj1;
        int i;
        int j;
        if (djh1.h())
        {
            i = 1;
        } else
        {
            i = 2;
        }
        obj.c = Integer.valueOf(i);
        obj1 = new iyf();
        obj1.a = Integer.valueOf(djh1.j());
        if (djh1.l() != null)
        {
            obj1.b = new kbm();
            ((iyf) (obj1)).b.a = djh1.l();
        }
        obj.d = ((iyf) (obj1));
        obj.e = Integer.valueOf(djh1.n());
        jds1.a = ((izg) (obj));
        if (djh1.c() != null)
        {
            jds1.d = new jax();
            jds1.d.a = djh1.c();
        }
        obj = new iwz();
        obj.a = Long.valueOf(djh1.g());
        jds1.requestHeader = a((new ctx()).a(r).b(t).a(s).a().a(((iwz) (obj))).b());
        obj = new jbr();
        obj1 = djh1.d();
        j = ((List) (obj1)).size();
        if (j > 0)
        {
            lcv alcv[] = new lcv[j];
            i = 0;
            while (i < j) 
            {
                dmt dmt1 = (dmt)((List) (obj1)).get(i);
                lcv lcv1 = new lcv();
                if (dmt1.b != null)
                {
                    lcv1.b = dmt1.b;
                }
                if (dmt1.d != null)
                {
                    lcv1.d = new lcu();
                    lcv1.d.a = dmt1.d;
                    lcv1.b = dmt1.b;
                }
                if (dmt1.c != 0)
                {
                    lcs lcs1 = new lcs();
                    boolean flag;
                    if ((dmt1.c & 1) != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    lcs1.a = Boolean.valueOf(flag);
                    if ((dmt1.c & 2) != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    lcs1.b = Boolean.valueOf(flag);
                    if ((dmt1.c & 4) != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    lcs1.c = Boolean.valueOf(flag);
                    if ((dmt1.c & 8) != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    lcs1.d = Boolean.valueOf(flag);
                    lcv1.c = lcs1;
                }
                lcv1.a = Integer.valueOf(dmt1.a);
                alcv[i] = lcv1;
                i++;
            }
            obj.a = alcv;
        }
        jds1.e = ((jbr) (obj));
        obj1 = new ArrayList();
        i = 0;
        obj = null;
        jyh jyh = djh1.e().a();
        while (jyh.hasNext()) 
        {
            Object obj2 = (ato)jyh.next();
            iwx iwx1 = new iwx();
            obj = ((ato) (obj2)).c;
            int k;
            if (atp.b.equals(((ato) (obj2)).c) || atp.c.equals(((ato) (obj2)).c))
            {
                obj2 = (atx)obj2;
                obj2 = (InputStreamContent)a(b, ((atx) (obj2)));
                k = i;
                if (obj2 != null)
                {
                    u.add(obj2);
                    k = i;
                }
            } else
            if (atp.d.equals(((ato) (obj2)).c))
            {
                obj2 = (aua)obj2;
                jsh jsh1 = djh1.f();
                iwx1.b = new jbl();
                iwx1.b.b = new jbn();
                iwx1.b.b.b = ((aua) (obj2)).e;
                if (jsh1 != null && jsh1.size() > i)
                {
                    iwx1.b.b.a = (String)jsh1.get(i);
                }
                iwx1.b.b.d = Boolean.valueOf(true);
                izh izh1 = new izh();
                izh1.b = new izj();
                izh1.b.b = ((aua) (obj2)).e;
                if (jsh1 != null && jsh1.size() > i)
                {
                    izh1.b.a = (String)jsh1.get(i);
                    i++;
                }
                izh1.b.d = Boolean.valueOf(true);
                jds1.f = izh1;
                k = i;
            } else
            {
                k = i;
                if (atp.e.equals(((ato) (obj2)).c))
                {
                    Object obj3 = ((atv)obj2).e;
                    Object obj4 = new kxr();
                    obj4.n = Double.valueOf(((fik) (obj3)).d().a);
                    obj4.o = Double.valueOf(((fik) (obj3)).d().b);
                    obj2 = new kxc();
                    ((kxc) (obj2)).setExtension(kxr.a, obj4);
                    Object obj5 = new kxs();
                    obj5.c = ((bzi)hlp.a(b, bzi)).a(((fik) (obj3)));
                    obj4 = new kxc();
                    ((kxc) (obj4)).setExtension(kxs.a, obj5);
                    Object obj6 = new kyt();
                    obj6.s = ((fik) (obj3)).b().toString();
                    obj5 = new kxc();
                    ((kxc) (obj5)).setExtension(kyt.a, obj6);
                    iwx1.c = new jbg();
                    iwx1.c.a = new kxy();
                    obj6 = ((fik) (obj3)).c().toString();
                    if (!TextUtils.isEmpty(((CharSequence) (obj6))))
                    {
                        iwx1.c.a.e = ((String) (obj6));
                    }
                    iwx1.c.a.w = ((kxc) (obj4));
                    iwx1.c.a.o = ((kxc) (obj2));
                    iwx1.c.a.n = ((kxc) (obj5));
                    obj6 = new jbg();
                    obj6.a = new kxy();
                    obj3 = ((fik) (obj3)).c().toString();
                    if (!TextUtils.isEmpty(((CharSequence) (obj3))))
                    {
                        ((jbg) (obj6)).a.e = ((String) (obj3));
                    }
                    ((jbg) (obj6)).a.w = ((kxc) (obj4));
                    ((jbg) (obj6)).a.o = ((kxc) (obj2));
                    ((jbg) (obj6)).a.n = ((kxc) (obj5));
                    jds1.g = ((jbg) (obj6));
                    k = i;
                }
            }
            ((List) (obj1)).add(iwx1);
            i = k;
        }
        if (atp.e.equals(obj) || atp.d.equals(obj))
        {
            jds1.c = (iwx[])((List) (obj1)).toArray(new iwx[((List) (obj1)).size()]);
        }
        if (u != null && u.size() != 0)
        {
            v = (new MultipartContent()).setContentParts(Arrays.asList(new HttpContent[] {
                new cum(jds1), (HttpContent)u.get(0)
            }));
        }
    }

    protected cxr a(kws kws1)
    {
        return czx.parseFrom((jdt)kws1);
    }

    public String a()
    {
        if (v != null)
        {
            return v.getMediaType().build();
        } else
        {
            return "application/x-protobuf";
        }
    }

    public void a(int i, Exception exception)
    {
        exception = e();
        if (exception == null)
        {
            return;
        }
        RealTimeChatService.a(r, exception);
        djh djh1 = (djh)super.e;
        exception = djh1.o();
        if (exception != null)
        {
            exception = String.valueOf(exception);
            if (exception.length() != 0)
            {
                exception = "Sending stress message succeeded:".concat(exception);
            } else
            {
                exception = new String("Sending stress message succeeded:");
            }
            eev.b("Babel_Stress", exception);
        }
        a(djh1, 12);
    }

    protected void b(kws kws1)
    {
        a((jds)kws1);
    }

    public byte[] b()
    {
        a((jds)q);
        if (a)
        {
            String s1 = String.valueOf(j());
            String s2 = String.valueOf(q);
            eev.b("Babel_SendMediaMessage", (new StringBuilder(String.valueOf(s1).length() + 29 + String.valueOf(s2).length())).append("getPostData of url ").append(s1).append(" request: ").append(s2).toString());
        }
        if (v != null)
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(1024);
            try
            {
                v.writeTo(bytearrayoutputstream);
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException("Cannot create a byte array stream", ioexception);
            }
            return bytearrayoutputstream.toByteArray();
        } else
        {
            return kws.toByteArray(q);
        }
    }

    public Bundle c()
    {
        Bundle bundle = super.c();
        if (v != null)
        {
            bundle.putString("uploadType", "multipart");
        }
        return bundle;
    }

    protected void d()
    {
        super.d();
        a((djh)super.e, 2);
    }

    static 
    {
        hnc hnc = eev.k;
    }
}
