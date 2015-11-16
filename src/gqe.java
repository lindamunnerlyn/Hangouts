// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.util.Property;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class gqe
    implements android.animation.Animator.AnimatorListener
{

    final gqb a;
    private gqc b;

    public gqe(gqb gqb1, gqc gqc1)
    {
        a = gqb1;
        super();
        b = gqc1;
    }

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
        gqc gqc1;
        Object obj;
        JSONObject jsonobject;
        Property aproperty[];
        String as[];
        Object obj1;
        int i;
        animator = a;
        gqc1 = b;
        JSONArray jsonarray;
        Iterator iterator;
        int k;
        try
        {
            jsonarray = gqc1.c.getJSONArray("animations");
            k = jsonarray.length();
        }
        // Misplaced declaration of an exception variable
        catch (Animator animator)
        {
            throw new gqd(animator);
        }
        i = 0;
_L7:
        if (i >= k) goto _L2; else goto _L1
_L1:
        jsonobject = jsonarray.getJSONObject(i);
        obj = gqc1.d.get(jsonobject.getString("id"));
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!jsonobject.has("initialValues"))
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonobject = jsonobject.getJSONObject("initialValues");
        iterator = jsonobject.keys();
_L6:
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = (String)iterator.next();
        } while (!((gqb) (animator)).d.containsKey(obj1));
        aproperty = (Property[])((gqb) (animator)).c.get(obj1);
        as = (String[])((gqb) (animator)).d.get(obj1);
        if (as != null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        if (gqc1.a(aproperty[0]))
        {
            aproperty[0].set(obj, Float.valueOf(gqb.a(gqc1, aproperty[0], jsonobject.getDouble(((String) (obj1))))));
            continue; /* Loop/switch isn't completed */
        }
        obj1 = jsonobject.getJSONObject(((String) (obj1)));
        int j = 0;
_L4:
        if (j >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (gqc1.a(aproperty[j]) && ((JSONObject) (obj1)).has(as[j]))
        {
            aproperty[j].set(obj, Float.valueOf(gqb.a(gqc1, aproperty[j], ((JSONObject) (obj1)).getDouble(as[j]))));
        }
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L2:
    }
}
