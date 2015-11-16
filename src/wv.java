// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.RatingBar;

public final class wv extends RatingBar
{

    private static final int a[] = {
        0x101013b, 0x101013c
    };
    private Bitmap b;

    public wv(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.M);
    }

    private wv(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (vk.a)
        {
            context = vm.a(getContext(), attributeset, a, i);
            attributeset = context.b(0);
            if (attributeset != null)
            {
                setIndeterminateDrawable(a(attributeset));
            }
            attributeset = context.b(1);
            if (attributeset != null)
            {
                setProgressDrawable(a(attributeset, false));
            }
            context.b();
        }
    }

    private Drawable a(Drawable drawable)
    {
        Object obj = drawable;
        if (drawable instanceof AnimationDrawable)
        {
            drawable = (AnimationDrawable)drawable;
            int j = drawable.getNumberOfFrames();
            obj = new AnimationDrawable();
            ((AnimationDrawable) (obj)).setOneShot(drawable.isOneShot());
            for (int i = 0; i < j; i++)
            {
                Drawable drawable1 = a(drawable.getFrame(i), true);
                drawable1.setLevel(10000);
                ((AnimationDrawable) (obj)).addFrame(drawable1, drawable.getDuration(i));
            }

            ((AnimationDrawable) (obj)).setLevel(10000);
        }
        return ((Drawable) (obj));
    }

    private Drawable a(Drawable drawable, boolean flag)
    {
        boolean flag1 = false;
        if (drawable instanceof fm)
        {
            Drawable drawable1 = ((fm)drawable).a();
            if (drawable1 != null)
            {
                drawable1 = a(drawable1, flag);
                ((fm)drawable).a(drawable1);
            }
        } else
        {
            if (drawable instanceof LayerDrawable)
            {
                drawable = (LayerDrawable)drawable;
                int k = drawable.getNumberOfLayers();
                Drawable adrawable[] = new Drawable[k];
                int i = 0;
                while (i < k) 
                {
                    int l = drawable.getId(i);
                    Drawable drawable2 = drawable.getDrawable(i);
                    if (l == 0x102000d || l == 0x102000f)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    adrawable[i] = a(drawable2, flag);
                    i++;
                }
                LayerDrawable layerdrawable = new LayerDrawable(adrawable);
                for (int j = ((flag1) ? 1 : 0); j < k; j++)
                {
                    layerdrawable.setId(j, drawable.getId(j));
                }

                return layerdrawable;
            }
            if (drawable instanceof BitmapDrawable)
            {
                Object obj = ((BitmapDrawable)drawable).getBitmap();
                if (b == null)
                {
                    b = ((Bitmap) (obj));
                }
                drawable = new ShapeDrawable(new RoundRectShape(new float[] {
                    5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
                }, null, null));
                obj = new BitmapShader(((Bitmap) (obj)), android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
                drawable.getPaint().setShader(((android.graphics.Shader) (obj)));
                if (flag)
                {
                    return new ClipDrawable(drawable, 3, 1);
                } else
                {
                    return drawable;
                }
            }
        }
        return drawable;
    }

    protected void onMeasure(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        super.onMeasure(i, j);
        if (b != null)
        {
            setMeasuredDimension(kb.a(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
