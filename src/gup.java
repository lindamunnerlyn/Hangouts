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

final class gup
    implements android.animation.Animator.AnimatorListener
{

    final gum a;
    private gun b;

    public gup(gum gum1, gun gun1)
    {
        a = gum1;
        super();
        b = gun1;
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
        gun gun1;
        Object obj;
        JSONObject jsonobject;
        Property aproperty[];
        String as[];
        Object obj1;
        int i;
        animator = a;
        gun1 = b;
        JSONArray jsonarray;
        Iterator iterator;
        int k;
        try
        {
            jsonarray = gun1.c.getJSONArray("animations");
            k = jsonarray.length();
        }
        // Misplaced declaration of an exception variable
        catch (Animator animator)
        {
            throw new guo(animator);
        }
        i = 0;
_L7:
        if (i >= k) goto _L2; else goto _L1
_L1:
        jsonobject = jsonarray.getJSONObject(i);
        obj = gun1.d.get(jsonobject.getString("id"));
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
        } while (!((gum) (animator)).d.containsKey(obj1));
        aproperty = (Property[])((gum) (animator)).c.get(obj1);
        as = (String[])((gum) (animator)).d.get(obj1);
        if (as != null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        if (gun1.a(aproperty[0]))
        {
            aproperty[0].set(obj, Float.valueOf(gum.a(gun1, aproperty[0], jsonobject.getDouble(((String) (obj1))))));
            continue; /* Loop/switch isn't completed */
        }
        obj1 = jsonobject.getJSONObject(((String) (obj1)));
        int j = 0;
_L4:
        if (j >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (gun1.a(aproperty[j]) && ((JSONObject) (obj1)).has(as[j]))
        {
            aproperty[j].set(obj, Float.valueOf(gum.a(gun1, aproperty[j], ((JSONObject) (obj1)).getDouble(as[j]))));
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
