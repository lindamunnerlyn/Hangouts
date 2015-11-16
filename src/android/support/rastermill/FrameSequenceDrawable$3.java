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
        if (FrameSequenceDrawable.access$900(FrameSequenceDrawable.this) != null)
        {
            FrameSequenceDrawable.access$900(FrameSequenceDrawable.this).onFinished(FrameSequenceDrawable.this);
        }
    }

    FinishedListener()
    {
        this$0 = FrameSequenceDrawable.this;
        super();
    }
}
