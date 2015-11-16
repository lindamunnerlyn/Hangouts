// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.rastermill;


// Referenced classes of package android.support.rastermill:
//            FrameSequenceDrawable

class this._cls0
    implements Runnable
{

    final FrameSequenceDrawable this$0;

    public void run()
    {
label0:
        {
            synchronized (FrameSequenceDrawable.access$000(FrameSequenceDrawable.this))
            {
                if (!FrameSequenceDrawable.access$100(FrameSequenceDrawable.this))
                {
                    break label0;
                }
            }
            return;
        }
        int i = FrameSequenceDrawable.access$200(FrameSequenceDrawable.this);
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj2;
        obj2 = FrameSequenceDrawable.access$300(FrameSequenceDrawable.this);
        FrameSequenceDrawable.access$402(FrameSequenceDrawable.this, 2);
        obj;
        JVM INSTR monitorexit ;
        boolean flag1;
        long l;
        long l1 = FrameSequenceDrawable.access$500(FrameSequenceDrawable.this).rame(i, ((android.graphics.Bitmap) (obj2)), i - 2);
        l = l1;
        if (l1 < 20L)
        {
            l = 100L;
        }
        flag1 = false;
        obj2 = FrameSequenceDrawable.access$000(FrameSequenceDrawable.this);
        obj2;
        JVM INSTR monitorenter ;
        if (!FrameSequenceDrawable.access$100(FrameSequenceDrawable.this)) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = FrameSequenceDrawable.access$300(FrameSequenceDrawable.this);
        FrameSequenceDrawable.access$302(FrameSequenceDrawable.this, null);
        boolean flag = false;
_L4:
        l = FrameSequenceDrawable.access$600(FrameSequenceDrawable.this);
        obj2;
        JVM INSTR monitorexit ;
        if (flag)
        {
            scheduleSelf(FrameSequenceDrawable.this, l);
        }
        if (obj1 != null)
        {
            FrameSequenceDrawable.access$800(FrameSequenceDrawable.this).releaseBitmap(((android.graphics.Bitmap) (obj1)));
            return;
        } else
        {
            return;
        }
_L2:
        flag = flag1;
        if (FrameSequenceDrawable.access$200(FrameSequenceDrawable.this) < 0)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        flag = flag1;
        if (FrameSequenceDrawable.access$400(FrameSequenceDrawable.this) != 2)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        flag = true;
        FrameSequenceDrawable.access$602(FrameSequenceDrawable.this, l + FrameSequenceDrawable.access$700(FrameSequenceDrawable.this));
        FrameSequenceDrawable.access$402(FrameSequenceDrawable.this, 3);
        break MISSING_BLOCK_LABEL_250;
        obj1;
        obj2;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    tmapProvider()
    {
        this$0 = FrameSequenceDrawable.this;
        super();
    }
}
