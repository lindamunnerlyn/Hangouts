// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class edn extends AsyncTask
{

    final edj a;
    private final Map b;
    private final int c[];
    private final Map d;
    private final android.graphics.BitmapFactory.Options e = edj.a();
    private final StringBuilder f;
    private final Canvas g;
    private final Context h;

    public edn(edj edj1, Context context, int ai[])
    {
        a = edj1;
        super();
        h = context.getApplicationContext();
        c = ai;
        int i = ai.length;
        b = Collections.synchronizedMap(new HashMap(i));
        d = Collections.synchronizedMap(new HashMap(i));
        if (edj.a(edj1))
        {
            f = new StringBuilder();
            g = new Canvas();
            return;
        } else
        {
            f = null;
            g = null;
            return;
        }
    }

    private transient void a(Integer ainteger[])
    {
        boolean flag;
        int i;
        flag = false;
        i = g.a(ainteger[0], 0);
        ainteger = b;
        ainteger;
        JVM INSTR monitorenter ;
        Object obj = (WeakReference)b.get(Integer.valueOf(i));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        Bitmap bitmap;
        Exception exception;
        if (isCancelled() || ((WeakReference) (obj)).get() == null)
        {
            flag = true;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        bitmap = (Bitmap)d.get(Integer.valueOf(i));
        obj = (ImageView)((WeakReference) (obj)).get();
        if (bitmap == null || obj == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        if (edj.a(((ImageView) (obj))) == this)
        {
            ((ImageView) (obj)).setImageBitmap(bitmap);
        }
        ainteger;
        JVM INSTR monitorexit ;
        return;
        exception;
        ainteger;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(int i, ImageView imageview)
    {
        b.put(Integer.valueOf(i), new WeakReference(imageview));
        a(new Integer[] {
            Integer.valueOf(i)
        });
    }

    protected Object doInBackground(Object aobj[])
    {
        int ai[] = c;
        int j = ai.length;
        int i = 0;
        while (i < j) 
        {
            int k = ai[i];
            if (isCancelled())
            {
                break;
            }
            Bitmap bitmap = (Bitmap)edj.b(a).a(Integer.valueOf(k));
            aobj = bitmap;
            if (bitmap == null)
            {
                aobj = bitmap;
                if (!isCancelled())
                {
                    if (edj.a(a))
                    {
                        aobj = edj.c().a(edj.c(a), edj.c(a), null);
                        ((Bitmap) (aobj)).eraseColor(0);
                        g.setBitmap(((Bitmap) (aobj)));
                        f.delete(0, f.length());
                        f.appendCodePoint(k);
                        String s = f.toString();
                        float f1 = ((Bitmap) (aobj)).getWidth() / 2;
                        float f2 = ((Bitmap) (aobj)).getHeight() / 2;
                        Rect rect = new Rect();
                        edj.d(a).getTextBounds(s, 0, s.length(), rect);
                        g.drawText(s, f1 - rect.exactCenterX(), f2 - rect.exactCenterY(), edj.d(a));
                        edj.b(a).a(Integer.valueOf(k), ((Object) (aobj)));
                    } else
                    {
                        long l1 = 0L;
                        if (edj.d())
                        {
                            l1 = SystemClock.elapsedRealtime();
                        }
                        int l = eha.a(h).a(k);
                        if (l == -1)
                        {
                            eev.f("Babel", (new StringBuilder(45)).append("Invalid resourceId for codePoint: ").append(k).toString());
                            aobj = null;
                        } else
                        {
                            aobj = edj.c().a(l, e, e.inTargetDensity, e.inTargetDensity);
                            if (aobj != null)
                            {
                                edj.b(a).a(Integer.valueOf(k), ((Object) (aobj)));
                            }
                            if (edj.d())
                            {
                                long l2 = SystemClock.elapsedRealtime();
                                eev.b("Babel", (new StringBuilder(45)).append("Emoji Bitmap decodingTim=").append(l2 - l1).toString());
                            }
                        }
                    }
                }
            }
            if (aobj != null && !isCancelled())
            {
                d.put(Integer.valueOf(k), ((Object) (aobj)));
                publishProgress(new Integer[] {
                    Integer.valueOf(k)
                });
            }
            i++;
        }
        return null;
    }

    protected void onCancelled(Object obj)
    {
        obj = c;
        int j = obj.length;
        for (int i = 0; i < j; i++)
        {
            int k = obj[i];
            edj.b(a).b(Integer.valueOf(k));
            Bitmap bitmap = (Bitmap)d.remove(Integer.valueOf(k));
            if (bitmap != null)
            {
                edj.c().a(bitmap);
            }
        }

    }

    protected void onProgressUpdate(Object aobj[])
    {
        a((Integer[])aobj);
    }
}
