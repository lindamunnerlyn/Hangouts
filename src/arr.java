// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.content.EsProvider;
import java.io.File;

public final class arr extends aqn
{

    private final int f;

    public arr(int i, edq edq, String s, aqs aqs, Object obj)
    {
label0:
        {
            super(edq, aqs, true, obj);
            f = i;
            if (s != null)
            {
                if (!(new File(s)).exists())
                {
                    break label0;
                }
                b.a(s);
            }
            return;
        }
        edq = String.valueOf(s);
        if (edq.length() != 0)
        {
            edq = "Missing cache file:".concat(edq);
        } else
        {
            edq = new String("Missing cache file:");
        }
        eev.f("Babel_StickerRequest", edq);
    }

    public void a(String s)
    {
        Object obj = String.valueOf(s);
        aow aow1;
        Object obj1;
        if (((String) (obj)).length() != 0)
        {
            obj = "fileSaved fileName:".concat(((String) (obj)));
        } else
        {
            obj = new String("fileSaved fileName:");
        }
        eev.e("Babel_StickerRequest", ((String) (obj)));
        aow1 = new aow(g.nU, f);
        obj1 = aow1.ai(b.r());
        if (obj1 != null && ((cza) (obj1)).c != null && !((cza) (obj1)).c.equals(s))
        {
            if (((cza) (obj1)).c.contains("sticker_cache") && !((cza) (obj1)).c.contains(EsProvider.b(g.nU)))
            {
                obj = ((cza) (obj1)).c;
                obj1 = String.valueOf(EsProvider.b(g.nU));
                eev.g("Babel_StickerRequest", (new StringBuilder(String.valueOf(obj).length() + 38 + String.valueOf(obj1).length())).append("path change detected. oldPath:").append(((String) (obj))).append(" not in:").append(((String) (obj1))).toString());
            } else
            {
                obj = new File(((cza) (obj1)).c);
                if (((File) (obj)).exists() && !((File) (obj)).delete())
                {
                    obj = String.valueOf(((cza) (obj1)).c);
                    if (((String) (obj)).length() != 0)
                    {
                        obj = "Couldn't delete file:".concat(((String) (obj)));
                    } else
                    {
                        obj = new String("Couldn't delete file:");
                    }
                    eev.g("Babel_StickerRequest", ((String) (obj)));
                }
                obj = ((cza) (obj1)).c;
                eev.g("Babel_StickerRequest", (new StringBuilder(String.valueOf(s).length() + 40 + String.valueOf(obj).length())).append("Deleted old file. fileName=").append(s).append(" oldFileName=").append(((String) (obj))).toString());
            }
        }
        if (!aow1.j(s, b.r()))
        {
            obj = new File(s);
            if (((File) (obj)).exists() && !((File) (obj)).delete())
            {
                obj = String.valueOf(s);
                if (((String) (obj)).length() != 0)
                {
                    obj = "Couldn't delete file:".concat(((String) (obj)));
                } else
                {
                    obj = new String("Couldn't delete file:");
                }
                eev.g("Babel_StickerRequest", ((String) (obj)));
            }
            obj = String.valueOf(b.r());
            eev.f("Babel_StickerRequest", (new StringBuilder(String.valueOf(s).length() + 43 + String.valueOf(obj).length())).append("Failed to update sticker fileName=").append(s).append(" photoId=").append(((String) (obj))).toString());
        }
    }

    public boolean f()
    {
        return true;
    }

    public File k()
    {
        return new File(EsProvider.b(g.nU));
    }
}
