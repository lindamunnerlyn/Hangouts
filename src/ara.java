// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.content.EsProvider;
import java.io.File;

public final class ara extends apw
{

    private final int f;

    public ara(int i, eam eam, String s, aqb aqb, Object obj)
    {
label0:
        {
            super(eam, aqb, true, obj);
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
        eam = String.valueOf(s);
        if (eam.length() != 0)
        {
            eam = "Missing cache file:".concat(eam);
        } else
        {
            eam = new String("Missing cache file:");
        }
        ebw.f("Babel_StickerRequest", eam);
    }

    public void a(String s)
    {
        Object obj = String.valueOf(s);
        aoe aoe1;
        Object obj1;
        if (((String) (obj)).length() != 0)
        {
            obj = "fileSaved fileName:".concat(((String) (obj)));
        } else
        {
            obj = new String("fileSaved fileName:");
        }
        ebw.e("Babel_StickerRequest", ((String) (obj)));
        aoe1 = new aoe(g.nS, f);
        obj1 = aoe1.aj(b.r());
        if (obj1 != null && ((cww) (obj1)).c != null && !((cww) (obj1)).c.equals(s))
        {
            if (((cww) (obj1)).c.contains("sticker_cache") && !((cww) (obj1)).c.contains(EsProvider.b(g.nS)))
            {
                obj = ((cww) (obj1)).c;
                obj1 = EsProvider.b(g.nS);
                ebw.g("Babel_StickerRequest", (new StringBuilder(String.valueOf(obj).length() + 38 + String.valueOf(obj1).length())).append("path change detected. oldPath:").append(((String) (obj))).append(" not in:").append(((String) (obj1))).toString());
            } else
            {
                obj = new File(((cww) (obj1)).c);
                if (((File) (obj)).exists() && !((File) (obj)).delete())
                {
                    obj = String.valueOf(((cww) (obj1)).c);
                    if (((String) (obj)).length() != 0)
                    {
                        obj = "Couldn't delete file:".concat(((String) (obj)));
                    } else
                    {
                        obj = new String("Couldn't delete file:");
                    }
                    ebw.g("Babel_StickerRequest", ((String) (obj)));
                }
                obj = ((cww) (obj1)).c;
                ebw.g("Babel_StickerRequest", (new StringBuilder(String.valueOf(s).length() + 40 + String.valueOf(obj).length())).append("Deleted old file. fileName=").append(s).append(" oldFileName=").append(((String) (obj))).toString());
            }
        }
        if (!aoe1.j(s, b.r()))
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
                ebw.g("Babel_StickerRequest", ((String) (obj)));
            }
            obj = b.r();
            ebw.f("Babel_StickerRequest", (new StringBuilder(String.valueOf(s).length() + 43 + String.valueOf(obj).length())).append("Failed to update sticker fileName=").append(s).append(" photoId=").append(((String) (obj))).toString());
        }
    }

    public boolean f()
    {
        return true;
    }

    public File j()
    {
        return new File(EsProvider.b(g.nS));
    }
}
