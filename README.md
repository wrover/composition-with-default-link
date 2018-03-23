# composition-with-default-link
This is a CUBA Platform sample application showing a quite popular use case of 
using compositions in a domain model:
- Entity `Parent` has multiple `Child`
- One of the children is considered as a "default one" by using a link from `Parent`

Of course, it's possible to use an attribute for `Child` to denote whether it's
a default child or not, but this approach makes an integrity check for having only
one default child rather difficult.

The tricky moment is saving this composition for the first time when creating
because here we have something a kind of cyclic references here. You can't create 
a `Parent` until you have a `Child` and vice-versa.

What you have to do is actually just to mark `DEFAULT_CHILD_ID` as nullable 
in the database and set the corresponding field in UI as `required`.

[CUBA Platform Forum Post](https://www.cuba-platform.com/discuss/t/whats-the-best-practice-for-compositions-with-cyclic-references/3224)
    
